//The elections results for an independent candidate were as follows:
//Female votes = 120
//Male votes = 50
//Spoilt votes = 22
//Using the statistics below as default values represent this information in a program having two function calls:
//i) the first one displaying the information above
//ii) the second one increasing the number of male votes by 20 in the function call


fun main (){
    var output=DisplayElectionResults(maleVotes=50+20)
    println("newMaleVotes=${output.data2}")
}
class DisplayElectionResults(femaleVotes:Int=120, maleVotes:Int=50, spoiltVotes:Int=22){


    var data1:Int
    var data2:Int
    var data3:Int
    init{
        this.data1=femaleVotes
        this.data2=maleVotes
        this.data3=spoiltVotes
    }

}