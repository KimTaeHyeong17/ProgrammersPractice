func solution(_ s:String) -> Int {
    var answer = 0
    if s[s.startIndex] == "-" {
        let tmp = s.dropFirst()
        answer = Int(tmp)!*(-1)
    }else{
        answer = Int(s) ?? 0
    }
    print( Int(s)! )
    return answer
}
