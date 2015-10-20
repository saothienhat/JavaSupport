package com.saothienhat.projects.tracnghiem;

public enum CorrectAnswerType {
	A("a"), B("b"), C("c"), D("d"), E("e");
    
    private String name;
    CorrectAnswerType(String name){
        this.name = name;
    }
    /**
     * Method to get field name as type 
     * @return the name
     */
    public String getName()
    {
        return name;
    }
}
