package com.ruoyi.project.module.device.service;

import com.ruoyi.project.module.device.domain.Device;
import java.util.List;

/**
 * 设备 服务层
 * 
 * @author ruoyi
 * @date 2018-09-03
 */
public interface IDeviceService 
{
	/**
     * 查询设备信息
     * 
     * @param id 设备ID
     * @return 设备信息
     */
	public Device selectDeviceById(String id);
	
	/**
     * 查询设备列表
     * 
     * @param device 设备信息
     * @return 设备集合
     */
	public List<Device> selectDeviceList(Device device);
	
	/**
     * 新增设备
     * 
     * @param device 设备信息
     * @return 结果
     */
	public int insertDevice(Device device);
	
	/**
     * 修改设备
     * 
     * @param device 设备信息
     * @return 结果
     */
	public int updateDevice(Device device);
		
	/**
     * 删除设备信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteDeviceByIds(String ids);
	
}
