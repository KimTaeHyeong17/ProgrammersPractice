import Foundation

func solution(_ heights:[Int]) -> [Int] {
    var answer = Array(repeating: 0, count: heights.count)

    for i in (0..<heights.count).reversed(){
        for j in (0..<i).reversed(){
            if heights[i] < heights[j] {
                // print("i : \(heights[i]) , j : \(heights[j])")
                answer[i] = j+1
                break
            }
            
        }
    }
    return answer
}
