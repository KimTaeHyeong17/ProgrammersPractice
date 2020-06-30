func solution(_ arr:[Int]) -> Double {
    var sum :Double = 0.0
    var answer : Double = 0.0
    
    for index in 0..<arr.count{
        sum = sum + Double(arr[index])
    }
    answer = sum/Double(arr.count)
    
    return answer
}
