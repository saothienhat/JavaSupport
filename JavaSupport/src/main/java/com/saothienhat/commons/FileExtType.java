package com.saothienhat.commons;

public enum FileExtType {
    TXT("txt"),
	PDF("pdf"),
	CSV("csv"),
	PNG("png"),
	JPEG("jpeg"),
	HTML("html"),
	JASPER("jasper");
	
	private String fileExt;
	
	FileExtType(String fileExt){
		this.fileExt = fileExt;
	}
	
	
	/**
	 * @return: "pdf", "doc", etc
	 */
	public String getFileExt(){
		return fileExt;
	}
	
	
	/**
	 * @return: ".pdf", ".doc", etc
	 */
	public String getSuffix(){
		return "." + fileExt;
	}
}
