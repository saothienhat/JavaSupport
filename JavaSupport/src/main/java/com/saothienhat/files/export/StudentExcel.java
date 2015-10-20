package com.saothienhat.files.export;

public class StudentExcel
{
    private String name;
    private String maths;
    private String science;
    private String english;

    public StudentExcel()
    {
    }

    public StudentExcel( String name, String maths, String science,
            String english )
    {
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;
    }

    /**
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return name + ": Maths " + maths + " Science " + science + " English "
                + english;
    }

    /**
     * Method to get field name as type String
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Method to set value for field name
     *
     * @param name the name to set
     */
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * Method to get field maths as type String
     * @return the maths
     */
    public String getMaths()
    {
        return maths;
    }

    /**
     * Method to set value for field maths
     *
     * @param maths the maths to set
     */
    public void setMaths( String maths )
    {
        this.maths = maths;
    }

    /**
     * Method to get field science as type String
     * @return the science
     */
    public String getScience()
    {
        return science;
    }

    /**
     * Method to set value for field science
     *
     * @param science the science to set
     */
    {
        this.science = science;
    }

    /**
     * Method to get field english as type String
     * @return the english
     */
    public String getEnglish()
    {
        return english;
    }

    /**
     * Method to set value for field english
     *
     * @param english the english to set
     */
    public void setEnglish( String english )
    {
        this.english = english;
    }

}
