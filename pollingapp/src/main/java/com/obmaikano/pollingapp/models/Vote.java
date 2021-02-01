package com.obmaikano.pollingapp.models;

import javax.persistence.*;

import com.obmaikano.pollingapp.models.audit.DateAudit;

@Entity
@Table(name = "votes", uniqueConstraints = {
		@UniqueConstraint(columnNames = {
				"poll_id",
				"user_id"
		})
})
public class Vote extends DateAudit {
	
	private static final long serialVersionUID = -9123568133177533633L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "poll_id", nullable = false)
	private Poll poll;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "choice_id", nullable = false)
	private Choice choice;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Poll getPoll() {
		return poll;
	}

	public void setPoll(Poll poll) {
		this.poll = poll;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Choice getChoice() {
		return choice;
	}

	public void setChoice(Choice choice) {
		this.choice = choice;
	}

	
}
