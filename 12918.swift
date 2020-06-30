func solution(_ s:String) -> Bool {
    if(Int(s) == nil || (s.count != 4 && s.count != 6)){
        print(Int(s))
        return false
    }
    return true
}
