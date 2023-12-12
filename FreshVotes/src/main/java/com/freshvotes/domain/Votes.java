package com.freshvotes.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Votes {
	
	private VoteId pk;
	private Boolean upvote;

	public Boolean getUpvote() {
		return upvote;
	}

	@EmbeddedId // if this is placed wrongly, then error (due to many-to-one in VoteId)
	public VoteId getPk() {
		return pk;
	}

	public void setPk(VoteId pk) {
		this.pk = pk;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
	
}
