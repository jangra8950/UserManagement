package com.locked;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWork {
	List<FileName> file = new ArrayList<>();

	public FileWork() {
	}

	public List<FileName> getFiles() {
		File f = new File("C:\\Java docs");
		file.clear();
		String[] s = f.list();
		for (String a : s)
			file.add(new FileName(a));
		return file;
	}

	public void addFile(String name) throws IOException {
		File f = new File("C:\\Java docs//" + name + ".txt");
		f.createNewFile();

	}

	public boolean deleteFile(String name) throws IOException {

		boolean isDelete = false;
		File f = new File("C:\\Java docs//" + name + ".txt");
		if (f.delete())
			isDelete = true;
		return isDelete;
	}

	public boolean searchFile(String name) {

		boolean isSearch = false;
		for (FileName a : file) {
			if (a.getFileName().startsWith(name)) {
				isSearch = true;
				break;
			}
		}
		return isSearch;
	}
}
