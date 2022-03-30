/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test6.pkg1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Yogita
 */
public class Test61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fileOutputStream = null;
		System.out.println("Please enter the file name: ");
		String fileName = bufferedReader.readLine();
		System.out.println("Please enter the date to store: ");
		String data = bufferedReader.readLine();
		try {
			fileOutputStream = new FileOutputStream((fileName + ".txt"), true);
			byte[] bytes = data.getBytes();
			fileOutputStream.write(bytes);

		} catch (IOException io) {
			io.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
					System.out.println("File has been created and stored...");
				}

			} catch (IOException io) {
				io.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
    
}
