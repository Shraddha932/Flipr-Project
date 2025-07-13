
package dto;

public class ClientDTO
{
    private String name;
    private String feedback;
    private String imageUrl;

    public String getName()
    { 
        return name; 
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getFeedback()
    {
        return feedback;
    }
    public void setFeedback(String feedback)
    {
        this.feedback = feedback;
    }

    public String getImageUrl()
    {
        return imageUrl; 
    }
    public void setImageUrl(String imageUrl) 
    { 
        this.imageUrl = imageUrl;
    }
}

