package com.selimhorri.pack.service;

import com.selimhorri.pack.listener.ResponseCallbackListener;
import com.selimhorri.pack.model.collection.DtoCollection;
import com.selimhorri.pack.model.dto.Employee;
import com.selimhorri.pack.model.dto.custom.EmployeeProjectData;
import com.selimhorri.pack.model.dto.custom.ProjectCommit;

public interface EmployeeService {

    void findAll(final ResponseCallbackListener.ResponseCallbackSuccessListener<DtoCollection<Employee>> response, final ResponseCallbackListener.ResponseCallbackErrorListener error);
    void findById(final Integer employeeId, final ResponseCallbackListener.ResponseCallbackSuccessListener<Employee> response, final ResponseCallbackListener.ResponseCallbackErrorListener error);
    void save(final Employee employee, final ResponseCallbackListener.ResponseCallbackSuccessListener<Employee> response, final ResponseCallbackListener.ResponseCallbackErrorListener error);
    void update(final Employee employee, final ResponseCallbackListener.ResponseCallbackSuccessListener<Employee> response, final ResponseCallbackListener.ResponseCallbackErrorListener error);
    void deleteById(final Integer employeeId, final ResponseCallbackListener.ResponseCallbackSuccessListener<Boolean> response, final ResponseCallbackListener.ResponseCallbackErrorListener error);
    void findByUsername(final String username, final ResponseCallbackListener.ResponseCallbackSuccessListener<Employee> response, final ResponseCallbackListener.ResponseCallbackErrorListener error);
    void findByEmployeeId(final Integer employeeId, final ResponseCallbackListener.ResponseCallbackSuccessListener<DtoCollection<EmployeeProjectData>> resp, final ResponseCallbackListener.ResponseCallbackErrorListener err);
    void findByProjectId(final Integer projectId, final ResponseCallbackListener.ResponseCallbackSuccessListener<DtoCollection<ProjectCommit>> resp, final ResponseCallbackListener.ResponseCallbackErrorListener err);
    void findByEmployeeIdAndProjectId(final Integer employeeId, final Integer projectId, final ResponseCallbackListener.ResponseCallbackSuccessListener<DtoCollection<ProjectCommit>> resp, final ResponseCallbackListener.ResponseCallbackErrorListener err);

}
