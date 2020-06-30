func solution(_ strings:[String], _ n:Int) -> [String] {
    var strArray = strings;
    for i in 0..<strings.count{
        let index = strings[i].index(strings[i].startIndex, offsetBy: n)
        strArray[i] = "\(strings[i][index])"+strings[i]
    }
    strArray.sort()
    for i in 0..<strArray.count{
        strArray[i] = String(strArray[i].dropFirst())
    }
    return strArray
}
