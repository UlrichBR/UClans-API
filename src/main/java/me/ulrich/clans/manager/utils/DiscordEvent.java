package me.ulrich.clans.manager.utils;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import me.ulrich.clans.Clans;

public class DiscordEvent {

	public DiscordEvent(String url) {
		
	}

	public void setContent(String content) {
		
	}

	public void setUsername(String username) {

	}

	public void setAvatarUrl(String avatarUrl) {

	}

	public void setTts(boolean tts) {

	}

	public void addEmbed(EmbedObject embed) {

	}

	public void execute(Clans plugin) throws IOException {

		
	}

	public static class EmbedObject {

		public String getTitle() {
			return null;
		}

		public String getDescription() {
			return null;
		}

		public String getUrl() {
			return null;
		}

		public Color getColor() {
			return null;
		}

		public Footer getFooter() {
			return null;
		}

		public Thumbnail getThumbnail() {
			return null;
		}

		public Image getImage() {
			return null;
		}

		public Author getAuthor() {
			return null;
		}

		public List<Field> getFields() {
			return null;
		}

		public EmbedObject setTitle(String title) {
			return null;
		}

		public EmbedObject setDescription(String description) {
			return null;
		}

		public EmbedObject setUrl(String url) {
			return null;
		}

		public EmbedObject setColor(Color color) {
			return null;
		}

		public EmbedObject setFooter(String text, String icon) {
			return null;
		}

		public EmbedObject setThumbnail(String url) {
			return null;
		}

		public EmbedObject setImage(String url) {
			return null;
		}

		public EmbedObject setAuthor(String name, String url, String icon) {
			return null;
		}

		public EmbedObject addField(String name, String value, boolean inline) {
			return null;
		}

		private class Footer {


			private Footer(String text, String iconUrl) {

			}

		}

		private class Thumbnail {

			private Thumbnail(String url) {
			
			}
		}

		private class Image {

			private Image(String url) {

			}

		}

		private class Author {


			private Author(String name, String url, String iconUrl) {

			}

		}

		private class Field {


			private Field(String name, String value, boolean inline) {

			}

		}
	}

	

}