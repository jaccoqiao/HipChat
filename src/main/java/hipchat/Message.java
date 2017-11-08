package hipchat;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Message 
{
	private List<String> mentions = new ArrayList<>();
	private List<String> emoticons = new ArrayList<>();
	private List<Link> links = new ArrayList<>();

	public List<String> getMentions()
	{
		return mentions;
	}
	public void setMentions(List<String> mentions)
	{
		this.mentions = mentions;
	}

	public List<String> getEmoticons()
	{
		return emoticons;
	}
	public void setEmoticons(List<String> emoticons)
	{
		this.emoticons = emoticons;
	}

	public List<Link> getLinks()
	{
		return links;
	}
	public void setLinks(List<Link> links)
	{
		this.links = links;
	}

	@JsonAutoDetect
	public static class Link
    {
        private String url;
        private String title;

		public Link(String url, String title)
		{
			this.url = url;
			this.title = title;
		}

		public Link()
		{
		}

		public String getUrl()
		{
			return url;
		}
		public void setUrl(String url)
		{
			this.url = url;
		}

		public String getTitle()
		{
			return title;
		}
		public void setTitle(String title)
		{
			this.title = title;
		}
	}
}
