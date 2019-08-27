class LazyProperty(val initializer: () -> Int) {
    var value:Int?=null
    val lazy: Int
        get() {
           if (value==null){
               value=initializer()
           }
            return value!!
        }


}
fun a(){
    LazyProperty(){2}
}
