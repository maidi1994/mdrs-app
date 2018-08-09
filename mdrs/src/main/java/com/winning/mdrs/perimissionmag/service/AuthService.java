package com.winning.mdrs.perimissionmag.service;

import com.winning.mdrs.perimissionmag.model.Permission;
import com.winning.mdrs.perimissionmag.model.Role;
import com.winning.mdrs.perimissionmag.po.PermissionVO;
import com.winning.mdrs.perimissionmag.po.RoleVO;

import java.util.List;

/**
 * @类描述：
 * @创建人：Johney
 * @创建时间：2017-12-20 15:52
 * @version：V1.0
 */
public interface AuthService {
	int addPermission(Permission permission);

	List<Permission> permList();

	int updatePerm(Permission permission);

	Permission getPermission(int id);

	String delPermission(int id);

	/**
	 * 查询所有角色
	 * @return
	 */
	List<Role> roleList();

	/**
	 * 关联查询权限树列表
	 * @return
	 */
	List<PermissionVO> findPerms();

	/**
	 * 添加角色
	 * @param role
	 * @param permIds
	 * @return
	 */
	String addRole(Role role, String permIds);

	RoleVO findRoleAndPerms(Integer id);

	/**
	 * 更新角色并授权
	 * @param role
	 * @param permIds
	 * @return
	 */
	String updateRole(Role role, String permIds);

	/**
	 * 删除角色以及它对应的权限
	 * @param id
	 * @return
	 */
	String delRole(int id);

	/**
	 * 查找所有角色
	 * @return
	 */
	List<Role> getRoles();

	/**
	 * 根据用户获取角色列表
	 * @param userId
	 * @return
	 */
	List<Role> getRoleByUser(Integer userId);

	/**
	 * 根据角色id获取权限数据
	 * @param id
	 * @return
	 */
	List<Permission> findPermsByRoleId(Integer id);

	/**
	 * 根据用户id获取权限数据
	 * @param id
	 * @return
	 */
	List<PermissionVO> getUserPerms(Integer id);
}
