package com.zjx.opensource.interfaceviewer.model;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;

public class InterfaceAddOrModifyParam implements Serializable {

    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface.request_method
     *
     * @mbg.generated
     */
    private String requestMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface.project_id
     *
     * @mbg.generated
     */
    private Integer projectId;

    private List<InterfaceField> fields;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public List<InterfaceField> getFields() {
        return fields;
    }

    public void setFields(List<InterfaceField> fields) {
        this.fields = fields;
    }

    public boolean isCorrect() {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        if (StringUtils.isEmpty(url)) {
            return false;
        }
        if (StringUtils.isEmpty(requestMethod)) {
            return false;
        }
        if (projectId == null || projectId <= 0) {
            return false;
        }
        for (InterfaceField field : fields) {
            if (StringUtils.isEmpty(field.getName())) {
                return false;
            }
            if (StringUtils.isEmpty(field.getType())) {
                return false;
            }
            if (StringUtils.isEmpty(field.getValueType())) {
                return false;
            }
        }
        return true;
    }
}