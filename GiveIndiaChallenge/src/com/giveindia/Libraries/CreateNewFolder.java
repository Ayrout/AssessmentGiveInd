package com.giveindia.Libraries;

import java.io.File;

public class CreateNewFolder 
{
	public static void createFolder(String folderName, String currentTime) 
	{
		System.out.println(System.getProperty("user.dir"));
		File dir = new File(System.getProperty("user.dir") + "\\Screenshots\\" + folderName);
		if (dir.exists()) 
		{
			String newDirName = System.getProperty("user.dir") + "\\Screenshots\\"
					+ folderName + currentTime;
			File newDir = new File(newDirName);
			dir.renameTo(newDir);
			dir.mkdir();
		} else 
		{
			dir.mkdir();
			System.out.println("New folder for screenshots created "+dir.mkdir());
		}

	}
}

