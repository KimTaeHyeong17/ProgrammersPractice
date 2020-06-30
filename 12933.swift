func solution(_ n:Int64) -> Int64 {
    var str = String(n)
    var arraylist = [String]()
    for i in 0..<str.count{
        let index = str.index(str.startIndex , offsetBy: i)
        arraylist.append(String(str[index]))
    }
    arraylist.sort()
    arraylist.reverse()
    var answer = ""
    for i in 0..<arraylist.count{
        answer.append(arraylist[i])
    }
    // print(answer)
    return Int64(answer)!
}
