package edu.utdallas.wpl.cookies.spring.dao.orm;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "transaction_info")
public class TransactionInfoEntity {
	
	@Id
	@Column(name = "TRAN_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRANSACTION_INFO_SEQUENCE")
	@SequenceGenerator(name = "TRANSACTION_INFO_SEQUENCE", sequenceName = "TRANSACTION_INFO_SEQUENCE")
	private Integer tranId;
	
	@OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn (name = "BID_ID")
	private PublishedBidsEntity bid;
	
	@OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn (name = "BIDPOSTER_ID")
	private UserInformationEntity bidPoster;
	
	@OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn (name = "BIDRECEIVER_ID")
	private UserInformationEntity bidReceiver;
	
	@Column(name="BID_PRICE", length = 20)
	private String bidPrice;
	
	public Integer getTranId() {
		return tranId;
	}
	
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	
	public PublishedBidsEntity getBid() {
		return bid;
	}
	
	public void setBid(PublishedBidsEntity bid) {
		this.bid = bid;
	}
	
	public String getBidPrice() {
		return bidPrice;
	}
	
	public void setBidPrice(String bidPrice) {
		this.bidPrice = bidPrice;
	}

	public UserInformationEntity getBidPoster() {
		return bidPoster;
	}

	public void setBidPoster(UserInformationEntity bidPoster) {
		this.bidPoster = bidPoster;
	}

	public UserInformationEntity getBidReceiver() {
		return bidReceiver;
	}

	public void setBidReceiver(UserInformationEntity bidReceiver) {
		this.bidReceiver = bidReceiver;
	}
	
}
