package mobi.f2time.dorado.examples.model.support;

/**
 * Author: chengen
 * Date: 2015/3/5
 * Time: 15:06
 */
public class QuotaBaseVo {
    private Integer bid = 0;

    private Integer win = 0;

    private Integer req = 0;

    private Integer exp = 0;

    private Integer clk = 0;

    private Long cost = 0L;

	private Long investment = 0l;

	private Integer act = 0;

    public Integer getReq() {
        return req;
    }

    public void setReq(Integer req) {
        this.req = req;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getClk() {
        return clk;
    }

    public void setClk(Integer clk) {
        this.clk = clk;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

	public Long getInvestment() {
		return investment;
	}

	public void setInvestment(Long investment) {
		this.investment = investment;
	}

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getAct() {
        return act;
    }

    public void setAct(Integer act) {
        this.act = act;
    }
}
