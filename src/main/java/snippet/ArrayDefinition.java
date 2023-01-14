package snippet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayDefinition {

    private static final Logger log = LogManager.getLogger(ArrayDefinition.class);

    public void printArrayElementsByIndex(int[] arrayOfIntegers) {
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int currentValue = arrayOfIntegers[i];
            log.info("Array Index: {}", i + " Value: " + currentValue);
        }
    }

    /**
     * ACCESS ALL elements from an array by iterating through the array's elements.
     *
     * @param arrayOfIntegers an array of integers
     * @return Returns a string of the printed array of integers
     */
    public String printArrayElements(int[] arrayOfIntegers) {
        return String.join(", ", Arrays.toString(arrayOfIntegers));
    }


    /**
     * REMOVES an element by finding the element at the specified index
     * and then removing that element. The rest of the elements are copied
     * into a new array. This would lead to an array of size one less
     * than the original array.
     *
     * @param index           index to remove from an array
     * @param arrayOfIntegers an array of integers
     * @return Returns an array without the removed element
     * Throws IndexOutOfBoundsException when index is not in array
     */
    public int[] removeElementFromArray(int[] arrayOfIntegers, int index) throws IndexOutOfBoundsException {
        if (arrayOfIntegers == null || index < 0 || index >= arrayOfIntegers.length) {
            return arrayOfIntegers;
        }

        int[] anotherArray = new int[arrayOfIntegers.length - 1];
        for (int i = 0, k = 0; i < arrayOfIntegers.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arrayOfIntegers[i];
        }
        log.info("New Array: " + Arrays.toString(anotherArray));
        return anotherArray;
    }

    /**
     * ACCESS A specific value from an array given an index.
     *
     * @param index           index to access from an array
     * @param arrayOfIntegers an array of integers
     * @return Returns the value of the index accessed in the array
     * Throws IndexOutOfBoundsException when index is not in array
     */
    public int accessValue(int[] arrayOfIntegers, int index) throws IndexOutOfBoundsException {
        int valueFromIndex = arrayOfIntegers[index];
        return valueFromIndex;
    }

    /**
     * UPDATE a value from an array given an index.
     *
     * @param arrayOfIntegers an array of integers
     * @param index           index to access from an array
     * @param value           value to replace the value at the index
     *                        Throws IndexOutOfBoundsException when index is not in array
     */
    public int[] updateValue(int[] arrayOfIntegers, int index, int value) throws IndexOutOfBoundsException {
        arrayOfIntegers[index] = value;
        return arrayOfIntegers;
    }

    /**
     * RETRIEVES the length of the array.
     *
     * @param arrayOfIntegers an array of integers
     *                        Throws IndexOutOfBoundsException when index is not in array
     */
    public int getArrayLength(int[] arrayOfIntegers) {
        return arrayOfIntegers.length;
    }
}
