/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author PHANH
 */
public class Option {
    private int option_id;
    private int question_id;
    private String content;
    private boolean isCorrect;

    public Option(int option_id, int question_id, String content, boolean isCorrect) {
        this.option_id = option_id;
        this.question_id = question_id;
        this.content = content;
        this.isCorrect = isCorrect;
    }

    public Option() {
    }

    public int getOption_id() {
        return option_id;
    }

    public void setOption_id(int option_id) {
        this.option_id = option_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "Option{" + "option_id=" + option_id + ", question_id=" + question_id + ", content=" + content + ", isCorrect=" + isCorrect + '}';
    }
    
}
