import Foundation

func solution(_ progresses:[Int], _ speeds:[Int]) -> [Int] {
    var answer = [Int]()
    
    var queue : [(Int,Int)] = []
    for i in 0..<progresses.count{
        queue.append((progresses[i],speeds[i]))
    }
    var deploy = 0
    while (!queue.isEmpty){
        for i in 0..<queue.count{
            queue[i].0 += queue[i].1
        }
        let progress = queue.first!.0
        if( progress > 100 ){
            for i in 0..<queue.count{
                if(queue[i].0 > 100){
                    deploy+=1
                }else{
                    break
                }
            }
            // print("deploy : \(deploy)")
            for i in 0..<deploy{
                if !queue.isEmpty {
                    queue.removeFirst()
                }
            }
            answer.append(deploy)
            deploy = 0
        }//end of if
        // print(queue)
    }
    
    return answer
}
