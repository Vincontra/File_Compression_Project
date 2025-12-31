# File Compression System Using Huffman Encoding

## 📌 Overview
This project is a Java-based file compression system built using **Huffman Encoding**, a lossless compression algorithm. It allows you to **compress files to reduce storage size** and **decompress them back to their original form**. The system can also compress alphabetic text into shorter binary sequences for efficient storage or transfer.

---

## 🚀 Features
- **Lossless Compression using Huffman Encoding**
- **Decompression back to original files**
- **Simple GUI for easy interaction**
- **Custom Data Structures (Linked Lists, Queues, Priority Queue)**
- **Progress Bar for compression/decompression**

---

## 📁 Code and Files
All main source files are located inside the `src` folder, including:

- `EncoderGUI.java` – Main application GUI
- `HuffCompression.java` – Core compression & decompression logic
- `HuffmanTree.java` – Builds the Huffman Tree
- `HuffmanEncoder.java` – Generates Huffman codes
- `MinPriorityQueue.java` – Priority queue for tree building
- Supporting files such as nodes, lists, queues, and UI helpers

---

## 🛠 Getting Started

### ✅ Prerequisites
- **Java JDK 8 or higher**
- **Any Java IDE (IntelliJ, Eclipse, etc.)**

---

## 📥 Installation
Clone the repository:
git clone https://github.com/Vincontra/File_Compression_Project.git



Open the project in your IDE and load the `src` folder.

---

## ▶️ Usage
- Compile all `.java` files (your IDE normally does this automatically)
- Run **`EncoderGUI.java`**
- Choose **Compress** or **Decompress** and select your file

*(CLI support can be added by modifying `HuffCompression.java` to accept command-line input.)*

---

## 📌 Example

### 🔻 Compress a File
1. Open the GUI
2. Select your file
3. Click **Compress**
4. Choose where to save the compressed file

### 🔺 Decompress a File
1. Open the GUI
2. Select the compressed file
3. Click **Decompress**
4. Choose the output location

---


