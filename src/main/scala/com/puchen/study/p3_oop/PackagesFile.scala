package com {

  import com.puchen.study.Inner

  object Outer{
    var out:String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }



  package puchen {
    package study {
      object Inner {
        val in:String = "puchen"
        def main(args: Array[String]): Unit = {

          println(Outer.out)
        }
      }
    }

  }

}


