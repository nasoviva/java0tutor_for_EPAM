package com.java0tutor.oop.task1.entity;

import java.util.List;

public class Directory {

	private String name;
	private List<File> files;

	public Directory() {
		name = "new directory";
	}

	public Directory(String name, List<File> files) {
		super();
		this.name = name;
		this.files = files;
	}

	public void addFile(File newFile) {
		files.add(newFile);
	}

	public void deleteFile(String name) {
		for (int i = 0; i < files.size(); i++) {
			if (files.get(i).getName().equals(name)) {
				files.remove(i);
			}
		}
	}

	public File createFile(String name) {
		File newFile = new File(name);
		addFile(newFile);
		return newFile;
	}

	public TextFile createTextFile(String name, String content) {
		TextFile newFile = new TextFile(name, content);
		addFile(newFile);
		return newFile;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [files=" + files + ", name=" + name + "]";
	}

}
