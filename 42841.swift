import Foundation

var stack : [[Int]] = []
func solution(_ baseball:[[Int]]) -> Int {
    var answer = 0
    let arr = [1,2,3,4,5,6,7,8,9]
    let n = arr.count
    let r = 3
    let output : [Int] = Array(repeating: 0, count: r)
    let visited : [Bool] = Array(repeating: false, count: n)
    permutation(arr,output,visited,0,n,r)
    while stack.isEmpty == false {
        var compare : [Int] = stack.removeFirst()
        var flag = true
        for item in baseball{
            var strike = 0
            var ball = 0
            var num = item[0]
            var tmpStrike = item[1]
            var tmpBall = item[2]
            var numArray : [Int] = String(num).compactMap{$0.wholeNumberValue}
            for i in 0..<3 {
                if compare[i] == numArray[i] {
                    strike += 1
                }
                if compare.contains(numArray[i]){
                    ball += 1
                }
            }
            ball = ball - strike
            if strike == tmpStrike && ball == tmpBall {
                
            }else{
                // print(compare,numArray,strike,ball)
                flag = false
            }
        }//end of loop
        if flag == true {
            answer += 1
        }   
    }
  
    
    return answer
}
func permutation(_ arr : [Int],_ output : [Int],_ visited : [Bool],_ depth : Int,_ n : Int,_ r : Int){
    var arr = arr
    var output = output
    var visited = visited

    if depth == r {
        stack.append(output)
        // print(output)
        return
    }
    for i in 0..<n {
        if visited[i] != true {
            visited[i] = true
            output[depth] = arr[i]
            permutation(arr,output,visited,depth + 1,n,r)
            output[depth] = 0
            visited[i] = false
        }
    }
}
