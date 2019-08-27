fun containsEven(collection: Collection<Int>): Boolean = collection.any {
    (it and 1)==0
}
