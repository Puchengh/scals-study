package com.puchen.study.pre.currying

object MyPredef {
  implicit def fileToRichFile(file: String) =
          new RichFile(file)
}
