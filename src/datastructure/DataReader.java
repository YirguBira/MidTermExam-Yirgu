package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Spliterator;

import databases.ConnectDB;

import javax.jnlp.FileContents;


public class DataReader {

	public static void main(String[] args) {

		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		//Reading from file: self-driving-car
		String textFile = "C:/Users/Yirgu/IdeaProjects/MidtemMarch2018/src/data/self-driving-car";
		//String textFile = System.getProperty("User.dir") + "/src/data/self-driving-car.txt";
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(textFile);
		}catch(Exception xception){
			System.out.println("No such file at the path specified");
		}
		try {
			if(fileReader != null) {
				bufferedReader = new BufferedReader(fileReader);
				String Str = "";
				while ((Str = bufferedReader.readLine()) != null) {
					String FileContent = Str;
					System.out.println(FileContent);
				}
			}
		}catch (Exception xception){
			xception.printStackTrace();
		}finally{
			if(fileReader != null){
				try {
					fileReader.close();
				}catch(Exception xception){
					xception.printStackTrace();
				}
			}
			if(bufferedReader != null){
				try {
					bufferedReader.close();
				}catch(Exception xception){
					xception.printStackTrace();
				}
			}

		}

		//Storing the input in db

	}

}
