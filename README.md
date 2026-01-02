# File Compression System Using Huffman Encoding

##  Overview
This project is a Java-based file compression system built using **Huffman Encoding**, a lossless compression algorithm. It allows you to **compress files to reduce storage size** and **decompress them back to their original form**. The system can also compress alphabetic text into shorter binary sequences for efficient storage or transfer.

---

## Features
- **Lossless Compression using Huffman Encoding**
- **Decompression back to original files**
- **Simple GUI for easy interaction**
- **Custom Data Structures (Linked Lists, Queues, Priority Queue)**
- **Progress Bar for compression/decompression**

---

## Code and Files
All main source files are located inside the `src` folder, including:

- `HuffmanGUI.java` – Main application GUI
- `HuffCompression.java` – Core compression & decompression logic
- `MinPriorityQueue.java` – Priority queue for tree building
- `ByteNode.java`-Node class which we needed to store the required data,frequency and pointers to childs
- Supporting files such as nodes, lists, queues, and UI helpers.(No need but we can create it to enhance UI(Not done yet)).

---

## 🛠 Getting Started

### Prerequisites
- **Java JDK 8 or higher**
- **Any Java IDE (IntelliJ, Eclipse, etc.)**

---

## Installation
Clone the repository:
git clone https://github.com/Vincontra/File_Compression_Project.git



Open the project in your IDE and load the `src` folder.

---

## Usage
- Compile all `.java` files (your IDE normally does this automatically)
- Run **`HuffmanGUI.java`**
- Choose **Compress** or **Decompress** and select your file

*(CLI support can be added by modifying `HuffCompression.java` to accept command-line input.)*

---

## Example

###  Compress a File
1. Open the GUI
2. Select your file
3. Click **Compress**
4. Choose where to save the compressed file

###  Decompress a File
1. Open the GUI
2. Select the compressed file
3. Click **Decompress**
4. Choose the output location

---

### Flow of the Project:
Compression:
File → Bytes → Huffman Tree → Codes → Compressed File

Decompression:
Compressed File → Codes → Bytes → Original File

---

### HuffmanTree Logic
1. Take two least frequent nodes
2. Merge them into one parent node
3. Repeat until only one node remains
4. That node becomes the Huffman Tree root

---
### Compression Logic

1. User selects a file

2. Read file as byte[]

3. Count frequency of each byte

4. Create ByteNode for each byte

5. Insert ByteNodes into MinPriorityQueue

6. Build Huffman Tree

7. Traverse tree to generate Huffman codes

8. Replace each byte with its Huffman code

9. Convert bit string into byte[]

Store:
- Compressed byte[]
- Huffman code map
 ---
### Decompression Logic
1. User selects compressed file

2. Read compressed byte[] and Huffman map

3. Convert byte[] back to bit string

4. Reverse Huffman map (code → byte)

5. Match bits to Huffman codes

6. Reconstruct original byte sequence

7. Write decompressed file



