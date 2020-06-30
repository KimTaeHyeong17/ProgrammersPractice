import Foundation

func solution(_ bridge_length:Int, _ weight:Int, _ truck_weights:[Int]) -> Int {
    var bridge = [Truck]()
    var waiting = [Truck]()
    var time = 0
    for i in 0..<truck_weights.count{
        var truck = Truck(position: 0, weight: truck_weights[i])
        waiting.append(truck)
    }
    var totalWeight = 0
    while waiting.count != 0 || bridge.count != 0{  
        if(waiting.count != 0 && totalWeight + waiting[0].weight <= weight){
            waiting[0].position = waiting[0].position + 1
            bridge.append(waiting[0])
            totalWeight = totalWeight + waiting[0].weight
            waiting.remove(at: 0)
        }
        if(bridge.count != 0 && bridge[0].position == bridge_length){
            totalWeight = totalWeight - bridge[0].weight
            bridge.remove(at: 0)
        }
        for i in 0..<bridge.count{
            bridge[i].position = bridge[i].position + 1
        }
        time = time + 1
    }
    return time+1
}
struct Truck {
    var position = 0
    var weight = 0
}
