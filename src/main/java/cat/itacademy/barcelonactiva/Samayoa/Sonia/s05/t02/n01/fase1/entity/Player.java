package cat.itacademy.barcelonactiva.Samayoa.Sonia.s05.t02.n01.fase1.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "PlayerName")
	private String PlayerName;
	
	@Column(name = "Date")
	private Date RegDate;

	@Column(name = "AverageSuccess")
	private double AverageSuccess;
	
	@OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Games> games;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
		
	public Date getRegDate() {
		return RegDate;
	}

	public void setRegDate(Date regDate) {
		RegDate = regDate;
	}

	public double getAverageSuccess() {
		return AverageSuccess;
	}

	public void setAverageSuccess(double averageSuccess) {
		AverageSuccess = averageSuccess;
	}

	public List<Games> getGames() {
		return games;
	}

	public void setGames(List<Games> games) {
		this.games = games;
	}


}
