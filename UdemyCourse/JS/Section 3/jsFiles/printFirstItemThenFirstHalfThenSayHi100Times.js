function printFirstItemThenFirstHalfThenSayHi100Times(items) {
    console.log(items[0]);
    var middleIndex = Math.floor(items.length / 2);
    var index = 0;

    while (index < middleIndex) {
        console.log(items[index]);
        index++;
    }

    for (var i = 0; i < 100; i++) {
        //O(n)
        console.log("hi");
    }
}
// BigO O(1 + n/2 + 100) --> O(n/2 + 1) --> O(n + 1) ---> O(n)
// We drop the constants
