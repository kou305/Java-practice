package dto;

import java.io.Serializable;

public class M01Dto implements Serializable {
	/* ID */
	private String m_ID;
	/* 曲名 */
	private String songTitle;
	/* アルバム名 */
	private String albumTitle;
	/* アーティスト名 */
	private String artinst;
	/* 発売年 */
	private String releaseYear;
	/* ジャンル */
	private String genre;
	/* 感想 */
	private String thought;
	
	public String getM_ID() {
		return m_ID;
	}
	public void setM_ID(String m_ID) {
		this.m_ID = m_ID;
	}
	public String getSongTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	public String getArtinst() {
		return artinst;
	}
	public void setArtinst(String artinst) {
		this.artinst = artinst;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getThought() {
		return thought;
	}
	public void setThought(String thought) {
		this.thought = thought;
	}
	
	
}
