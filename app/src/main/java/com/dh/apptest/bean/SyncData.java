package com.dh.apptest.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/1/20.
 */

public class SyncData {
	/**
	 * success : true
	 * code : 0
	 * msg : ok
	 * data : {"category":[[{"id":118,"pid":33,"name":"第一篇 消防法及相关法律法规与消防职业道德","quenum":62,"child":[{"id":119,"pid":118,"name":"第一章 消防法及相关法律法规","quenum":57,"category":",15,17,33,118,119,"},{"id":120,"pid":118,"name":"第二章 注册消防工程师职业道德","quenum":5,"category":",15,17,33,118,120,"}]}]],"questions":[{"id":5237,"type":0,"title":"《注册消防工程师制度暂行规定》对注册消防工程师的权利和义务进行了规定，下列不属于注册消防工程师权利的是（ ）。","options":{"A":"在规定范围内从事消防安全技术执业活动","B":"对违反相关法律、法规和技术标准的行为提出劝告，并向本级别注册审批部门或者上级主管部门报告","C":"不需要接受继续教育","D":"获得与执业责任相应的劳动报酬","E":""},"answer":"C","analysis":"注册消防工程师的权利主要有在规定范围内从事消防安全技术执业活动；对违反相关法律、法规和技术标准的行为提出劝告，并向本级别注册审批部门或者上级主管部门报告；接受继续教育；获得与执业责任相应的劳动报酬等。","difficulty":1,"category":",15,17,33,118,119,","images":{"title":"","A":"","B":"","C":"","D":"","E":"","analysis":""},"weigh":1,"status":1}],"papers":[{"id":3,"type":34,"name":"2017消防工程师综合能力模拟测试","time":120,"totalscore":120,"radio":80,"radio_score":1,"checkbox":20,"checkbox_score":2,"judge":0,"judge_score":0,"rule1_end":60,"rule1_name":"不及格","rule2_start":60,"rule2_end":80,"rule2_name":"优秀","rule3_start":80,"rule3_end":100,"rule3_name":"学霸"}],"papersCategory":[{"id":14,"pid":0,"type":0,"name":"消防员","accounted":0}],"version":"1"}
	 */

	private boolean success;
	private int code;
	private String msg;
	private DataBean data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public DataBean getData() {
		return data;
	}

	public void setData(DataBean data) {
		this.data = data;
	}

	public static class DataBean {
		/**
		 * category : [[{"id":118,"pid":33,"name":"第一篇 消防法及相关法律法规与消防职业道德","quenum":62,"child":[{"id":119,"pid":118,"name":"第一章 消防法及相关法律法规","quenum":57,"category":",15,17,33,118,119,"},{"id":120,"pid":118,"name":"第二章 注册消防工程师职业道德","quenum":5,"category":",15,17,33,118,120,"}]}]]
		 * questions : [{"id":5237,"type":0,"title":"《注册消防工程师制度暂行规定》对注册消防工程师的权利和义务进行了规定，下列不属于注册消防工程师权利的是（ ）。","options":{"A":"在规定范围内从事消防安全技术执业活动","B":"对违反相关法律、法规和技术标准的行为提出劝告，并向本级别注册审批部门或者上级主管部门报告","C":"不需要接受继续教育","D":"获得与执业责任相应的劳动报酬","E":""},"answer":"C","analysis":"注册消防工程师的权利主要有在规定范围内从事消防安全技术执业活动；对违反相关法律、法规和技术标准的行为提出劝告，并向本级别注册审批部门或者上级主管部门报告；接受继续教育；获得与执业责任相应的劳动报酬等。","difficulty":1,"category":",15,17,33,118,119,","images":{"title":"","A":"","B":"","C":"","D":"","E":"","analysis":""},"weigh":1,"status":1}]
		 * papers : [{"id":3,"type":34,"name":"2017消防工程师综合能力模拟测试","time":120,"totalscore":120,"radio":80,"radio_score":1,"checkbox":20,"checkbox_score":2,"judge":0,"judge_score":0,"rule1_end":60,"rule1_name":"不及格","rule2_start":60,"rule2_end":80,"rule2_name":"优秀","rule3_start":80,"rule3_end":100,"rule3_name":"学霸"}]
		 * papersCategory : [{"id":14,"pid":0,"type":0,"name":"消防员","accounted":0}]
		 * version : 1
		 */

		private String version;
		private List<List<CategoryBean>> category;
		private List<QuestionsBean> questions;
		private List<PapersBean> papers;
		private List<PapersCategoryBean> papersCategory;

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<List<CategoryBean>> getCategory() {
			return category;
		}

		public void setCategory(List<List<CategoryBean>> category) {
			this.category = category;
		}

		public List<QuestionsBean> getQuestions() {
			return questions;
		}

		public void setQuestions(List<QuestionsBean> questions) {
			this.questions = questions;
		}

		public List<PapersBean> getPapers() {
			return papers;
		}

		public void setPapers(List<PapersBean> papers) {
			this.papers = papers;
		}

		public List<PapersCategoryBean> getPapersCategory() {
			return papersCategory;
		}

		public void setPapersCategory(List<PapersCategoryBean> papersCategory) {
			this.papersCategory = papersCategory;
		}

		public static class CategoryBean {
			/**
			 * id : 118
			 * pid : 33
			 * name : 第一篇 消防法及相关法律法规与消防职业道德
			 * quenum : 62
			 * child : [{"id":119,"pid":118,"name":"第一章 消防法及相关法律法规","quenum":57,"category":",15,17,33,118,119,"},{"id":120,"pid":118,"name":"第二章 注册消防工程师职业道德","quenum":5,"category":",15,17,33,118,120,"}]
			 */

			private int id;
			private int pid;
			private String name;
			private int quenum;
			private List<ChildBean> child;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public int getPid() {
				return pid;
			}

			public void setPid(int pid) {
				this.pid = pid;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getQuenum() {
				return quenum;
			}

			public void setQuenum(int quenum) {
				this.quenum = quenum;
			}

			public List<ChildBean> getChild() {
				return child;
			}

			public void setChild(List<ChildBean> child) {
				this.child = child;
			}

			public static class ChildBean {
				/**
				 * id : 119
				 * pid : 118
				 * name : 第一章 消防法及相关法律法规
				 * quenum : 57
				 * category : ,15,17,33,118,119,
				 */

				private int id;
				private int pid;
				private String name;
				private int quenum;
				private String category;

				public int getId() {
					return id;
				}

				public void setId(int id) {
					this.id = id;
				}

				public int getPid() {
					return pid;
				}

				public void setPid(int pid) {
					this.pid = pid;
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public int getQuenum() {
					return quenum;
				}

				public void setQuenum(int quenum) {
					this.quenum = quenum;
				}

				public String getCategory() {
					return category;
				}

				public void setCategory(String category) {
					this.category = category;
				}
			}
		}

		public static class QuestionsBean {
			/**
			 * id : 5237
			 * type : 0
			 * title : 《注册消防工程师制度暂行规定》对注册消防工程师的权利和义务进行了规定，下列不属于注册消防工程师权利的是（ ）。
			 * options : {"A":"在规定范围内从事消防安全技术执业活动","B":"对违反相关法律、法规和技术标准的行为提出劝告，并向本级别注册审批部门或者上级主管部门报告","C":"不需要接受继续教育","D":"获得与执业责任相应的劳动报酬","E":""}
			 * answer : C
			 * analysis : 注册消防工程师的权利主要有在规定范围内从事消防安全技术执业活动；对违反相关法律、法规和技术标准的行为提出劝告，并向本级别注册审批部门或者上级主管部门报告；接受继续教育；获得与执业责任相应的劳动报酬等。
			 * difficulty : 1
			 * category : ,15,17,33,118,119,
			 * images : {"title":"","A":"","B":"","C":"","D":"","E":"","analysis":""}
			 * weigh : 1
			 * status : 1
			 */

			private int id;
			private int type;
			private String title;
			private OptionsBean options;
			private String answer;
			private String analysis;
			private int difficulty;
			private String category;
			private ImagesBean images;
			private int weigh;
			private int status;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public int getType() {
				return type;
			}

			public void setType(int type) {
				this.type = type;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public OptionsBean getOptions() {
				return options;
			}

			public void setOptions(OptionsBean options) {
				this.options = options;
			}

			public String getAnswer() {
				return answer;
			}

			public void setAnswer(String answer) {
				this.answer = answer;
			}

			public String getAnalysis() {
				return analysis;
			}

			public void setAnalysis(String analysis) {
				this.analysis = analysis;
			}

			public int getDifficulty() {
				return difficulty;
			}

			public void setDifficulty(int difficulty) {
				this.difficulty = difficulty;
			}

			public String getCategory() {
				return category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public ImagesBean getImages() {
				return images;
			}

			public void setImages(ImagesBean images) {
				this.images = images;
			}

			public int getWeigh() {
				return weigh;
			}

			public void setWeigh(int weigh) {
				this.weigh = weigh;
			}

			public int getStatus() {
				return status;
			}

			public void setStatus(int status) {
				this.status = status;
			}

			public static class OptionsBean {
				/**
				 * A : 在规定范围内从事消防安全技术执业活动
				 * B : 对违反相关法律、法规和技术标准的行为提出劝告，并向本级别注册审批部门或者上级主管部门报告
				 * C : 不需要接受继续教育
				 * D : 获得与执业责任相应的劳动报酬
				 * E :
				 */

				private String A;
				private String B;
				private String C;
				private String D;
				private String E;

				public String getA() {
					return A;
				}

				public void setA(String A) {
					this.A = A;
				}

				public String getB() {
					return B;
				}

				public void setB(String B) {
					this.B = B;
				}

				public String getC() {
					return C;
				}

				public void setC(String C) {
					this.C = C;
				}

				public String getD() {
					return D;
				}

				public void setD(String D) {
					this.D = D;
				}

				public String getE() {
					return E;
				}

				public void setE(String E) {
					this.E = E;
				}
			}

			public static class ImagesBean {
				/**
				 * title :
				 * A :
				 * B :
				 * C :
				 * D :
				 * E :
				 * analysis :
				 */

				private String title;
				private String A;
				private String B;
				private String C;
				private String D;
				private String E;
				private String analysis;

				public String getTitle() {
					return title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getA() {
					return A;
				}

				public void setA(String A) {
					this.A = A;
				}

				public String getB() {
					return B;
				}

				public void setB(String B) {
					this.B = B;
				}

				public String getC() {
					return C;
				}

				public void setC(String C) {
					this.C = C;
				}

				public String getD() {
					return D;
				}

				public void setD(String D) {
					this.D = D;
				}

				public String getE() {
					return E;
				}

				public void setE(String E) {
					this.E = E;
				}

				public String getAnalysis() {
					return analysis;
				}

				public void setAnalysis(String analysis) {
					this.analysis = analysis;
				}
			}
		}

		public static class PapersBean {
			/**
			 * id : 3
			 * type : 34
			 * name : 2017消防工程师综合能力模拟测试
			 * time : 120
			 * totalscore : 120
			 * radio : 80
			 * radio_score : 1
			 * checkbox : 20
			 * checkbox_score : 2
			 * judge : 0
			 * judge_score : 0
			 * rule1_end : 60
			 * rule1_name : 不及格
			 * rule2_start : 60
			 * rule2_end : 80
			 * rule2_name : 优秀
			 * rule3_start : 80
			 * rule3_end : 100
			 * rule3_name : 学霸
			 */

			private int id;
			private int type;
			private String name;
			private int time;
			private int totalscore;
			private int radio;
			private int radio_score;
			private int checkbox;
			private int checkbox_score;
			private int judge;
			private int judge_score;
			private int rule1_end;
			private String rule1_name;
			private int rule2_start;
			private int rule2_end;
			private String rule2_name;
			private int rule3_start;
			private int rule3_end;
			private String rule3_name;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public int getType() {
				return type;
			}

			public void setType(int type) {
				this.type = type;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getTime() {
				return time;
			}

			public void setTime(int time) {
				this.time = time;
			}

			public int getTotalscore() {
				return totalscore;
			}

			public void setTotalscore(int totalscore) {
				this.totalscore = totalscore;
			}

			public int getRadio() {
				return radio;
			}

			public void setRadio(int radio) {
				this.radio = radio;
			}

			public int getRadio_score() {
				return radio_score;
			}

			public void setRadio_score(int radio_score) {
				this.radio_score = radio_score;
			}

			public int getCheckbox() {
				return checkbox;
			}

			public void setCheckbox(int checkbox) {
				this.checkbox = checkbox;
			}

			public int getCheckbox_score() {
				return checkbox_score;
			}

			public void setCheckbox_score(int checkbox_score) {
				this.checkbox_score = checkbox_score;
			}

			public int getJudge() {
				return judge;
			}

			public void setJudge(int judge) {
				this.judge = judge;
			}

			public int getJudge_score() {
				return judge_score;
			}

			public void setJudge_score(int judge_score) {
				this.judge_score = judge_score;
			}

			public int getRule1_end() {
				return rule1_end;
			}

			public void setRule1_end(int rule1_end) {
				this.rule1_end = rule1_end;
			}

			public String getRule1_name() {
				return rule1_name;
			}

			public void setRule1_name(String rule1_name) {
				this.rule1_name = rule1_name;
			}

			public int getRule2_start() {
				return rule2_start;
			}

			public void setRule2_start(int rule2_start) {
				this.rule2_start = rule2_start;
			}

			public int getRule2_end() {
				return rule2_end;
			}

			public void setRule2_end(int rule2_end) {
				this.rule2_end = rule2_end;
			}

			public String getRule2_name() {
				return rule2_name;
			}

			public void setRule2_name(String rule2_name) {
				this.rule2_name = rule2_name;
			}

			public int getRule3_start() {
				return rule3_start;
			}

			public void setRule3_start(int rule3_start) {
				this.rule3_start = rule3_start;
			}

			public int getRule3_end() {
				return rule3_end;
			}

			public void setRule3_end(int rule3_end) {
				this.rule3_end = rule3_end;
			}

			public String getRule3_name() {
				return rule3_name;
			}

			public void setRule3_name(String rule3_name) {
				this.rule3_name = rule3_name;
			}
		}

		public static class PapersCategoryBean {
			/**
			 * id : 14
			 * pid : 0
			 * type : 0
			 * name : 消防员
			 * accounted : 0
			 */

			private int id;
			private int pid;
			private int type;
			private String name;
			private int accounted;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public int getPid() {
				return pid;
			}

			public void setPid(int pid) {
				this.pid = pid;
			}

			public int getType() {
				return type;
			}

			public void setType(int type) {
				this.type = type;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAccounted() {
				return accounted;
			}

			public void setAccounted(int accounted) {
				this.accounted = accounted;
			}
		}
	}
}
