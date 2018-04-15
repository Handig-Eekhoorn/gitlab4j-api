package org.gitlab4j.api.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PushRule {

    private Integer id;
    private Integer projectId;
    private String commitMessageRegex;
    private String branchNameRegex;
    private Boolean denyDeleteTag;
    private Date createdAt;
    private Boolean memberCheck;
    private Boolean preventSecrets;
    private String authorEmailRegex;
    private String fileNameRegex;
    private Integer maxFileSize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    
    public PushRule withProjectId(Integer projectId) {
        this.projectId = projectId;
        return (this);
    }

    public String getCommitMessageRegex() {
        return commitMessageRegex;
    }

    public void setCommitMessageRegex(String commitMessageRegex) {
        this.commitMessageRegex = commitMessageRegex;
    }
    
    public PushRule withCommitMessageRegex(String commitMessageRegex) {
        this.commitMessageRegex = commitMessageRegex;
    return (this);
 }

    public String getBranchNameRegex() {
        return branchNameRegex;
    }

    public void setBranchNameRegex(String branchNameRegex) {
        this.branchNameRegex = branchNameRegex;
    }
    
    public PushRule withBranchNameRegex(String branchNameRegex) {
        this.branchNameRegex = branchNameRegex;
    return (this);
 }
 
    public Boolean getDenyDeleteTag() {
        return denyDeleteTag;
    }

    public void setDenyDeleteTag(Boolean denyDeleteTag) {
        this.denyDeleteTag = denyDeleteTag;
    }
    
    public PushRule withDenyDeleteTag(Boolean denyDeleteTag) {
        this.denyDeleteTag = denyDeleteTag;
    return (this);
 }
 
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getMemberCheck() {
        return memberCheck;
    }

    public void setMemberCheck(Boolean memberCheck) {
        this.memberCheck = memberCheck;
    }
    
    public PushRule withMemberCheck(Boolean memberCheck) {
        this.memberCheck = memberCheck;
    return (this);
 }
 
    public Boolean getPreventSecrets() {
        return preventSecrets;
    }

    public void setPreventSecrets(Boolean preventSecrets) {
        this.preventSecrets = preventSecrets;
    }
    
    public PushRule withPreventSecrets(Boolean preventSecrets) {
        this.preventSecrets = preventSecrets;
    return (this);
 }
 
    public String getAuthorEmailRegex() {
        return authorEmailRegex;
    }

    public void setAuthorEmailRegex(String authorEmailRegex) {
        this.authorEmailRegex = authorEmailRegex;
    }
    
    public PushRule withAuthorEmailRegex(String authorEmailRegex) {
        this.authorEmailRegex = authorEmailRegex;
    return (this);
 }
 
    public String getFileNameRegex() {
        return fileNameRegex;
    }

    public void setFileNameRegex(String fileNameRegex) {
        this.fileNameRegex = fileNameRegex;
    }
    
    public PushRule withFileNameRegex(String fileNameRegex) {
        this.fileNameRegex = fileNameRegex;
    return (this);
 }
 
    public Integer getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }
    
    public PushRule withMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    return (this);
 }
 }
