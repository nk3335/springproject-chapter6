package kr.or.hoseo.springproject.chapter6.vo;

/*

// SELECT
SELECT
	m_id,
	m_pw,
	m_type,
	m_email,
	m_regdate
FROM
	member
WHERE
	m_id = #mId#
	AND m_pw = #mPw#
	AND m_type = #mType#
	AND m_email = #mEmail#
	AND m_regdate = #mRegdate#

// INSERT
INSERT INTO member
(
	m_id,
	m_pw,
	m_type,
	m_email,
	m_regdate
)
VALUES
(
	#mId#,
	#mPw#,
	#mType#,
	#mEmail#,
	#mRegdate#
)

// UPDATE
UPDATE
	member
SET
	m_id = #mId#,
	m_pw = #mPw#,
	m_type = #mType#,
	m_email = #mEmail#,
	m_regdate = #mRegdate#
WHERE
	m_id = #mId#
	AND m_pw = #mPw#
	AND m_type = #mType#
	AND m_email = #mEmail#
	AND m_regdate = #mRegdate#

// DELETE
DELETE FROM
	member
WHERE
	m_id = #mId#
	AND m_pw = #mPw#
	AND m_type = #mType#
	AND m_email = #mEmail#
	AND m_regdate = #mRegdate#

*/
import java.util.Date;

/**
 * Table name : member
 * Generated by CUBRID Tools.
 */
public class Member {
	private String mId = null;
	private String mPw = null;
	private Integer mType = null;
	private String mEmail = null;
	private Date mRegdate = null;

	/**
	 * mId (character varying)
	 *
	 * @return mId
	 */
	public String getMId() {
		return mId;
	}

	/**
	 * mId (character varying)
	 *
	 * @param mId
	 */
	public void setMId(String mId) {
		this.mId = mId;
	}

	/**
	 * mPw (character varying)
	 *
	 * @return mPw
	 */
	public String getMPw() {
		return mPw;
	}

	/**
	 * mPw (character varying)
	 *
	 * @param mPw
	 */
	public void setMPw(String mPw) {
		this.mPw = mPw;
	}

	/**
	 * mType (integer)
	 *
	 * @return mType
	 */
	public Integer getMType() {
		return mType;
	}

	/**
	 * mType (integer)
	 *
	 * @param mType
	 */
	public void setMType(Integer mType) {
		this.mType = mType;
	}

	/**
	 * mEmail (character varying)
	 *
	 * @return mEmail
	 */
	public String getMEmail() {
		return mEmail;
	}

	/**
	 * mEmail (character varying)
	 *
	 * @param mEmail
	 */
	public void setMEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	/**
	 * mRegdate (datetime)
	 *
	 * @return mRegdate
	 */
	public Date getMRegdate() {
		return mRegdate;
	}

	/**
	 * mRegdate (datetime)
	 *
	 * @param mRegdate
	 */
	public void setMRegdate(Date mRegdate) {
		this.mRegdate = mRegdate;
	}

}