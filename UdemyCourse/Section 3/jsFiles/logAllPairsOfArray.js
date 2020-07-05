//Log all pairs of array

const boxes = ["a", "b", "c", "d", "e"];
const boxes2 = [1, 2, 3, 4, 5];

function logAllPairsOfArray(array) {
    for (i = 0; i < array.length; i++) {
        for (j = 0; j < array.length; j++) {
            console.log(array[i], array[j]);
        }
    }
}
function logAllPairsOfBoxes(array) {
    for (i = 0; i < array.length; i++) {
        for (j = 0; j < array.length; j++) {
            console.log(array[i], array[j]);
        }
    }
}

logAllPairsOfArray(boxes2); // Numbers
logAllPairsOfArray(boxes); // Letters

//BigO O(n * n) --> O(n^2)
