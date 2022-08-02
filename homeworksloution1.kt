fun main() {
   val candles = 24
   val layers = 5
   println("Number of candels: $candles")
   println("Cake top length: $candles")
   println("Number of layers: $layers ")
   printCakeCandles(candles)
   printCakeTop(candles)
   printCakeBottom(candles,layers)
}

fun printCakeCandles(candles: Int){
   print(" ") // to be site a candles on the cake
   repeat(candles){
       print(",") 
   }
   println() // to print blank line
   
 	print(" ") // to be site a candles on the cake
   repeat(candles){
       print("|")
   }
   println() // to print blank line
}

fun printCakeTop(candles: Int){
   // +2 so that the candles won't to fall off the side of the cake 
  repeat(candles+2){
      print("=")
  }
  println() // to print blank line
}

fun printCakeBottom(candles: Int, layers: Int){
   //nested loop to print @ for 5 layers
  repeat(layers){
      repeat(candles+2){
      print("@")
  }
  println() // to print blank line
  }
   
}
