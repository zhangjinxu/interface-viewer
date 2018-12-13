package com.zjx.opensource.interfaceviewer.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   Users and global privileges
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user
 */
public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.User
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Host
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Select_priv
     *
     * @mbg.generated
     */
    private String selectPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Insert_priv
     *
     * @mbg.generated
     */
    private String insertPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Update_priv
     *
     * @mbg.generated
     */
    private String updatePriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Delete_priv
     *
     * @mbg.generated
     */
    private String deletePriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Create_priv
     *
     * @mbg.generated
     */
    private String createPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Drop_priv
     *
     * @mbg.generated
     */
    private String dropPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Reload_priv
     *
     * @mbg.generated
     */
    private String reloadPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Shutdown_priv
     *
     * @mbg.generated
     */
    private String shutdownPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Process_priv
     *
     * @mbg.generated
     */
    private String processPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.File_priv
     *
     * @mbg.generated
     */
    private String filePriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Grant_priv
     *
     * @mbg.generated
     */
    private String grantPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.References_priv
     *
     * @mbg.generated
     */
    private String referencesPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Index_priv
     *
     * @mbg.generated
     */
    private String indexPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Alter_priv
     *
     * @mbg.generated
     */
    private String alterPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Show_db_priv
     *
     * @mbg.generated
     */
    private String showDbPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Super_priv
     *
     * @mbg.generated
     */
    private String superPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Create_tmp_table_priv
     *
     * @mbg.generated
     */
    private String createTmpTablePriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Lock_tables_priv
     *
     * @mbg.generated
     */
    private String lockTablesPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Execute_priv
     *
     * @mbg.generated
     */
    private String executePriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Repl_slave_priv
     *
     * @mbg.generated
     */
    private String replSlavePriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Repl_client_priv
     *
     * @mbg.generated
     */
    private String replClientPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Create_view_priv
     *
     * @mbg.generated
     */
    private String createViewPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Show_view_priv
     *
     * @mbg.generated
     */
    private String showViewPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Create_routine_priv
     *
     * @mbg.generated
     */
    private String createRoutinePriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Alter_routine_priv
     *
     * @mbg.generated
     */
    private String alterRoutinePriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Create_user_priv
     *
     * @mbg.generated
     */
    private String createUserPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Event_priv
     *
     * @mbg.generated
     */
    private String eventPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Trigger_priv
     *
     * @mbg.generated
     */
    private String triggerPriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Create_tablespace_priv
     *
     * @mbg.generated
     */
    private String createTablespacePriv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ssl_type
     *
     * @mbg.generated
     */
    private String sslType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.max_questions
     *
     * @mbg.generated
     */
    private Integer maxQuestions;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.max_updates
     *
     * @mbg.generated
     */
    private Integer maxUpdates;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.max_connections
     *
     * @mbg.generated
     */
    private Integer maxConnections;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.max_user_connections
     *
     * @mbg.generated
     */
    private Integer maxUserConnections;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.plugin
     *
     * @mbg.generated
     */
    private String plugin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password_expired
     *
     * @mbg.generated
     */
    private String passwordExpired;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password_last_changed
     *
     * @mbg.generated
     */
    private Date passwordLastChanged;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password_lifetime
     *
     * @mbg.generated
     */
    private Short passwordLifetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.account_locked
     *
     * @mbg.generated
     */
    private String accountLocked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ssl_cipher
     *
     * @mbg.generated
     */
    private byte[] sslCipher;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.x509_issuer
     *
     * @mbg.generated
     */
    private byte[] x509Issuer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.x509_subject
     *
     * @mbg.generated
     */
    private byte[] x509Subject;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.authentication_string
     *
     * @mbg.generated
     */
    private String authenticationString;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.User
     *
     * @return the value of user.User
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.User
     *
     * @param user the value for user.User
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Host
     *
     * @return the value of user.Host
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Host
     *
     * @param host the value for user.Host
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Select_priv
     *
     * @return the value of user.Select_priv
     *
     * @mbg.generated
     */
    public String getSelectPriv() {
        return selectPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Select_priv
     *
     * @param selectPriv the value for user.Select_priv
     *
     * @mbg.generated
     */
    public void setSelectPriv(String selectPriv) {
        this.selectPriv = selectPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Insert_priv
     *
     * @return the value of user.Insert_priv
     *
     * @mbg.generated
     */
    public String getInsertPriv() {
        return insertPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Insert_priv
     *
     * @param insertPriv the value for user.Insert_priv
     *
     * @mbg.generated
     */
    public void setInsertPriv(String insertPriv) {
        this.insertPriv = insertPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Update_priv
     *
     * @return the value of user.Update_priv
     *
     * @mbg.generated
     */
    public String getUpdatePriv() {
        return updatePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Update_priv
     *
     * @param updatePriv the value for user.Update_priv
     *
     * @mbg.generated
     */
    public void setUpdatePriv(String updatePriv) {
        this.updatePriv = updatePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Delete_priv
     *
     * @return the value of user.Delete_priv
     *
     * @mbg.generated
     */
    public String getDeletePriv() {
        return deletePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Delete_priv
     *
     * @param deletePriv the value for user.Delete_priv
     *
     * @mbg.generated
     */
    public void setDeletePriv(String deletePriv) {
        this.deletePriv = deletePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Create_priv
     *
     * @return the value of user.Create_priv
     *
     * @mbg.generated
     */
    public String getCreatePriv() {
        return createPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Create_priv
     *
     * @param createPriv the value for user.Create_priv
     *
     * @mbg.generated
     */
    public void setCreatePriv(String createPriv) {
        this.createPriv = createPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Drop_priv
     *
     * @return the value of user.Drop_priv
     *
     * @mbg.generated
     */
    public String getDropPriv() {
        return dropPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Drop_priv
     *
     * @param dropPriv the value for user.Drop_priv
     *
     * @mbg.generated
     */
    public void setDropPriv(String dropPriv) {
        this.dropPriv = dropPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Reload_priv
     *
     * @return the value of user.Reload_priv
     *
     * @mbg.generated
     */
    public String getReloadPriv() {
        return reloadPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Reload_priv
     *
     * @param reloadPriv the value for user.Reload_priv
     *
     * @mbg.generated
     */
    public void setReloadPriv(String reloadPriv) {
        this.reloadPriv = reloadPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Shutdown_priv
     *
     * @return the value of user.Shutdown_priv
     *
     * @mbg.generated
     */
    public String getShutdownPriv() {
        return shutdownPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Shutdown_priv
     *
     * @param shutdownPriv the value for user.Shutdown_priv
     *
     * @mbg.generated
     */
    public void setShutdownPriv(String shutdownPriv) {
        this.shutdownPriv = shutdownPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Process_priv
     *
     * @return the value of user.Process_priv
     *
     * @mbg.generated
     */
    public String getProcessPriv() {
        return processPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Process_priv
     *
     * @param processPriv the value for user.Process_priv
     *
     * @mbg.generated
     */
    public void setProcessPriv(String processPriv) {
        this.processPriv = processPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.File_priv
     *
     * @return the value of user.File_priv
     *
     * @mbg.generated
     */
    public String getFilePriv() {
        return filePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.File_priv
     *
     * @param filePriv the value for user.File_priv
     *
     * @mbg.generated
     */
    public void setFilePriv(String filePriv) {
        this.filePriv = filePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Grant_priv
     *
     * @return the value of user.Grant_priv
     *
     * @mbg.generated
     */
    public String getGrantPriv() {
        return grantPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Grant_priv
     *
     * @param grantPriv the value for user.Grant_priv
     *
     * @mbg.generated
     */
    public void setGrantPriv(String grantPriv) {
        this.grantPriv = grantPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.References_priv
     *
     * @return the value of user.References_priv
     *
     * @mbg.generated
     */
    public String getReferencesPriv() {
        return referencesPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.References_priv
     *
     * @param referencesPriv the value for user.References_priv
     *
     * @mbg.generated
     */
    public void setReferencesPriv(String referencesPriv) {
        this.referencesPriv = referencesPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Index_priv
     *
     * @return the value of user.Index_priv
     *
     * @mbg.generated
     */
    public String getIndexPriv() {
        return indexPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Index_priv
     *
     * @param indexPriv the value for user.Index_priv
     *
     * @mbg.generated
     */
    public void setIndexPriv(String indexPriv) {
        this.indexPriv = indexPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Alter_priv
     *
     * @return the value of user.Alter_priv
     *
     * @mbg.generated
     */
    public String getAlterPriv() {
        return alterPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Alter_priv
     *
     * @param alterPriv the value for user.Alter_priv
     *
     * @mbg.generated
     */
    public void setAlterPriv(String alterPriv) {
        this.alterPriv = alterPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Show_db_priv
     *
     * @return the value of user.Show_db_priv
     *
     * @mbg.generated
     */
    public String getShowDbPriv() {
        return showDbPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Show_db_priv
     *
     * @param showDbPriv the value for user.Show_db_priv
     *
     * @mbg.generated
     */
    public void setShowDbPriv(String showDbPriv) {
        this.showDbPriv = showDbPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Super_priv
     *
     * @return the value of user.Super_priv
     *
     * @mbg.generated
     */
    public String getSuperPriv() {
        return superPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Super_priv
     *
     * @param superPriv the value for user.Super_priv
     *
     * @mbg.generated
     */
    public void setSuperPriv(String superPriv) {
        this.superPriv = superPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Create_tmp_table_priv
     *
     * @return the value of user.Create_tmp_table_priv
     *
     * @mbg.generated
     */
    public String getCreateTmpTablePriv() {
        return createTmpTablePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Create_tmp_table_priv
     *
     * @param createTmpTablePriv the value for user.Create_tmp_table_priv
     *
     * @mbg.generated
     */
    public void setCreateTmpTablePriv(String createTmpTablePriv) {
        this.createTmpTablePriv = createTmpTablePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Lock_tables_priv
     *
     * @return the value of user.Lock_tables_priv
     *
     * @mbg.generated
     */
    public String getLockTablesPriv() {
        return lockTablesPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Lock_tables_priv
     *
     * @param lockTablesPriv the value for user.Lock_tables_priv
     *
     * @mbg.generated
     */
    public void setLockTablesPriv(String lockTablesPriv) {
        this.lockTablesPriv = lockTablesPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Execute_priv
     *
     * @return the value of user.Execute_priv
     *
     * @mbg.generated
     */
    public String getExecutePriv() {
        return executePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Execute_priv
     *
     * @param executePriv the value for user.Execute_priv
     *
     * @mbg.generated
     */
    public void setExecutePriv(String executePriv) {
        this.executePriv = executePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Repl_slave_priv
     *
     * @return the value of user.Repl_slave_priv
     *
     * @mbg.generated
     */
    public String getReplSlavePriv() {
        return replSlavePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Repl_slave_priv
     *
     * @param replSlavePriv the value for user.Repl_slave_priv
     *
     * @mbg.generated
     */
    public void setReplSlavePriv(String replSlavePriv) {
        this.replSlavePriv = replSlavePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Repl_client_priv
     *
     * @return the value of user.Repl_client_priv
     *
     * @mbg.generated
     */
    public String getReplClientPriv() {
        return replClientPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Repl_client_priv
     *
     * @param replClientPriv the value for user.Repl_client_priv
     *
     * @mbg.generated
     */
    public void setReplClientPriv(String replClientPriv) {
        this.replClientPriv = replClientPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Create_view_priv
     *
     * @return the value of user.Create_view_priv
     *
     * @mbg.generated
     */
    public String getCreateViewPriv() {
        return createViewPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Create_view_priv
     *
     * @param createViewPriv the value for user.Create_view_priv
     *
     * @mbg.generated
     */
    public void setCreateViewPriv(String createViewPriv) {
        this.createViewPriv = createViewPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Show_view_priv
     *
     * @return the value of user.Show_view_priv
     *
     * @mbg.generated
     */
    public String getShowViewPriv() {
        return showViewPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Show_view_priv
     *
     * @param showViewPriv the value for user.Show_view_priv
     *
     * @mbg.generated
     */
    public void setShowViewPriv(String showViewPriv) {
        this.showViewPriv = showViewPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Create_routine_priv
     *
     * @return the value of user.Create_routine_priv
     *
     * @mbg.generated
     */
    public String getCreateRoutinePriv() {
        return createRoutinePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Create_routine_priv
     *
     * @param createRoutinePriv the value for user.Create_routine_priv
     *
     * @mbg.generated
     */
    public void setCreateRoutinePriv(String createRoutinePriv) {
        this.createRoutinePriv = createRoutinePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Alter_routine_priv
     *
     * @return the value of user.Alter_routine_priv
     *
     * @mbg.generated
     */
    public String getAlterRoutinePriv() {
        return alterRoutinePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Alter_routine_priv
     *
     * @param alterRoutinePriv the value for user.Alter_routine_priv
     *
     * @mbg.generated
     */
    public void setAlterRoutinePriv(String alterRoutinePriv) {
        this.alterRoutinePriv = alterRoutinePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Create_user_priv
     *
     * @return the value of user.Create_user_priv
     *
     * @mbg.generated
     */
    public String getCreateUserPriv() {
        return createUserPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Create_user_priv
     *
     * @param createUserPriv the value for user.Create_user_priv
     *
     * @mbg.generated
     */
    public void setCreateUserPriv(String createUserPriv) {
        this.createUserPriv = createUserPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Event_priv
     *
     * @return the value of user.Event_priv
     *
     * @mbg.generated
     */
    public String getEventPriv() {
        return eventPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Event_priv
     *
     * @param eventPriv the value for user.Event_priv
     *
     * @mbg.generated
     */
    public void setEventPriv(String eventPriv) {
        this.eventPriv = eventPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Trigger_priv
     *
     * @return the value of user.Trigger_priv
     *
     * @mbg.generated
     */
    public String getTriggerPriv() {
        return triggerPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Trigger_priv
     *
     * @param triggerPriv the value for user.Trigger_priv
     *
     * @mbg.generated
     */
    public void setTriggerPriv(String triggerPriv) {
        this.triggerPriv = triggerPriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Create_tablespace_priv
     *
     * @return the value of user.Create_tablespace_priv
     *
     * @mbg.generated
     */
    public String getCreateTablespacePriv() {
        return createTablespacePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Create_tablespace_priv
     *
     * @param createTablespacePriv the value for user.Create_tablespace_priv
     *
     * @mbg.generated
     */
    public void setCreateTablespacePriv(String createTablespacePriv) {
        this.createTablespacePriv = createTablespacePriv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ssl_type
     *
     * @return the value of user.ssl_type
     *
     * @mbg.generated
     */
    public String getSslType() {
        return sslType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ssl_type
     *
     * @param sslType the value for user.ssl_type
     *
     * @mbg.generated
     */
    public void setSslType(String sslType) {
        this.sslType = sslType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.max_questions
     *
     * @return the value of user.max_questions
     *
     * @mbg.generated
     */
    public Integer getMaxQuestions() {
        return maxQuestions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.max_questions
     *
     * @param maxQuestions the value for user.max_questions
     *
     * @mbg.generated
     */
    public void setMaxQuestions(Integer maxQuestions) {
        this.maxQuestions = maxQuestions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.max_updates
     *
     * @return the value of user.max_updates
     *
     * @mbg.generated
     */
    public Integer getMaxUpdates() {
        return maxUpdates;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.max_updates
     *
     * @param maxUpdates the value for user.max_updates
     *
     * @mbg.generated
     */
    public void setMaxUpdates(Integer maxUpdates) {
        this.maxUpdates = maxUpdates;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.max_connections
     *
     * @return the value of user.max_connections
     *
     * @mbg.generated
     */
    public Integer getMaxConnections() {
        return maxConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.max_connections
     *
     * @param maxConnections the value for user.max_connections
     *
     * @mbg.generated
     */
    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.max_user_connections
     *
     * @return the value of user.max_user_connections
     *
     * @mbg.generated
     */
    public Integer getMaxUserConnections() {
        return maxUserConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.max_user_connections
     *
     * @param maxUserConnections the value for user.max_user_connections
     *
     * @mbg.generated
     */
    public void setMaxUserConnections(Integer maxUserConnections) {
        this.maxUserConnections = maxUserConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.plugin
     *
     * @return the value of user.plugin
     *
     * @mbg.generated
     */
    public String getPlugin() {
        return plugin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.plugin
     *
     * @param plugin the value for user.plugin
     *
     * @mbg.generated
     */
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password_expired
     *
     * @return the value of user.password_expired
     *
     * @mbg.generated
     */
    public String getPasswordExpired() {
        return passwordExpired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password_expired
     *
     * @param passwordExpired the value for user.password_expired
     *
     * @mbg.generated
     */
    public void setPasswordExpired(String passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password_last_changed
     *
     * @return the value of user.password_last_changed
     *
     * @mbg.generated
     */
    public Date getPasswordLastChanged() {
        return passwordLastChanged;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password_last_changed
     *
     * @param passwordLastChanged the value for user.password_last_changed
     *
     * @mbg.generated
     */
    public void setPasswordLastChanged(Date passwordLastChanged) {
        this.passwordLastChanged = passwordLastChanged;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password_lifetime
     *
     * @return the value of user.password_lifetime
     *
     * @mbg.generated
     */
    public Short getPasswordLifetime() {
        return passwordLifetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password_lifetime
     *
     * @param passwordLifetime the value for user.password_lifetime
     *
     * @mbg.generated
     */
    public void setPasswordLifetime(Short passwordLifetime) {
        this.passwordLifetime = passwordLifetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account_locked
     *
     * @return the value of user.account_locked
     *
     * @mbg.generated
     */
    public String getAccountLocked() {
        return accountLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account_locked
     *
     * @param accountLocked the value for user.account_locked
     *
     * @mbg.generated
     */
    public void setAccountLocked(String accountLocked) {
        this.accountLocked = accountLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ssl_cipher
     *
     * @return the value of user.ssl_cipher
     *
     * @mbg.generated
     */
    public byte[] getSslCipher() {
        return sslCipher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ssl_cipher
     *
     * @param sslCipher the value for user.ssl_cipher
     *
     * @mbg.generated
     */
    public void setSslCipher(byte[] sslCipher) {
        this.sslCipher = sslCipher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.x509_issuer
     *
     * @return the value of user.x509_issuer
     *
     * @mbg.generated
     */
    public byte[] getX509Issuer() {
        return x509Issuer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.x509_issuer
     *
     * @param x509Issuer the value for user.x509_issuer
     *
     * @mbg.generated
     */
    public void setX509Issuer(byte[] x509Issuer) {
        this.x509Issuer = x509Issuer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.x509_subject
     *
     * @return the value of user.x509_subject
     *
     * @mbg.generated
     */
    public byte[] getX509Subject() {
        return x509Subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.x509_subject
     *
     * @param x509Subject the value for user.x509_subject
     *
     * @mbg.generated
     */
    public void setX509Subject(byte[] x509Subject) {
        this.x509Subject = x509Subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.authentication_string
     *
     * @return the value of user.authentication_string
     *
     * @mbg.generated
     */
    public String getAuthenticationString() {
        return authenticationString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.authentication_string
     *
     * @param authenticationString the value for user.authentication_string
     *
     * @mbg.generated
     */
    public void setAuthenticationString(String authenticationString) {
        this.authenticationString = authenticationString;
    }
}