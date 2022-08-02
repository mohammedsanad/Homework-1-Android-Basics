# Homework-1-Android-Basics

### Description | وصف الواجب
In this task, you are going to build a code to bake a cake to always be the right number of layers, size, and with the right number of candles.


### Instructions | التعليمات
1. You will create a total of three functions for drawing a layered cake with candles.
2. You will use a repeat() inside another repeat(), creating what's called a "nested loop".


### Functions used | الدوال المستخدمة
1. printCakeCandles(candles: Int)
2. printCakeTop(candles: Int)
3. printCakeBottom(candles: Int, layers: Int)


### Notes | ملاحظات
> The way you will build up this code is how you can build up any program, starting with the big picture and adding detail. This is called "top-down development".




### Here is a picture of the cake you will be baking | صورة النتيجة النهائية

![Cake Output](https://github.com/shaima-alghamdi-tuwaiq/Homework-1-Android-Basics/blob/a745ff19ff5912d2533905b53421b6a3f0cbd85d/output.png)

solution for the homework 1
Description |

In this task, you are going to build a code to bake a cake to always be the right number of layers, size, and with the right number of candles.

Instructions |

You will create a total of three functions for drawing a layered cake with candles. You will use a repeat() inside another repeat(), creating what's called a "nested loop".

The Solution:
Run a program - kotlin playground

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
