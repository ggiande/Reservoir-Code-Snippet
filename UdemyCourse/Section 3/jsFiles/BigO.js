const nemo = ["nemo"];
const everyone = [
    "dory",
    "bruce",
    "marlin",
    "gill",
    "bloat",
    "nemo",
    "nigel",
    "squirt",
    "darla",
    "hank",
];

function findNemo(array) {
    for (let i = 0; i < array.length; i++) {
        // BigO O(n)
        // Iterates through entirety of array
        // console.log("Running " + i);
        if (array[i] == "nemo") {
            // Checks if nemo can be found at any index within the array
            console.log("Found NEMO!");
            break;
        }
    }
}

findNemo(everyone);
