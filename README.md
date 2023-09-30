# Bubble Sort in Java

This repository contains a simple implementation of the Bubble Sort algorithm in Java. Bubble Sort is a straightforward sorting algorithm that repeatedly steps through the list to be sorted, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed on your system. You can download it [here](https://www.oracle.com/java/technologies/javase-downloads.html).
- A code editor or Integrated Development Environment (IDE) such as [Eclipse](https://www.eclipse.org/), [IntelliJ IDEA](https://www.jetbrains.com/idea/), or a simple text editor for writing Java code.

### Clone the Repository

To get started, clone this repository to your local machine using Git:

``` shell
git clone https://github.com/your-username/bubble-sort-java.git
```

### Compile and Run

1. Navigate to the project directory:

``` shell
cd bubble-sort-java
```

2. Compile the Java program:

``` shell
javac BubbleSort.java
```

3. Run the program:

``` shell
java BubbleSort
```

## Usage

Modify the `BubbleSort.java` file to use the Bubble Sort algorithm for sorting your data. You can replace the sample array in the `main` method with your own data to sort.

```java
public static void main(String[] args) {
    int[] array = {64, 25, 12, 22, 11};
    bubble sort(array);
    System. out.println("Sorted array");
    print array(array);
}
```

## Algorithm

Bubble Sort is a simple sorting algorithm that works by repeatedly stepping through the list, comparing each pair of adjacent items, and swapping them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.

Here is the basic algorithm in pseudo-code:

```plaintext
procedure bubble sort(A : list of sortable items)
    n := length(A)
    repeat
        swapped := false
        for i:= 1 to n - 1 inclusive do
            if A[i - 1] > A[i] then
                swap(A[i - 1], A[i])
                swapped := true
            end if
        end for
    until not swapped
end procedure
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- This implementation is for educational purposes and may not be the most efficient sorting algorithm for large datasets.
- Bubble Sort is not recommended for use in production code where more efficient sorting algorithms like QuickSort or MergeSort are available.
