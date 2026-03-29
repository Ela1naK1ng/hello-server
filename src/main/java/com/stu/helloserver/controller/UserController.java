package com.stu.helloserver.controller;

import com.stu.helloserver.common.Result;
import com.stu.helloserver.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public Result<String> getUser(@PathVariable Long id) {
        String data = "查询成功，正在返回ID为 " + id + " 的用户信息";
        return Result.success(data);
    }

    @PostMapping
    public Result<String> createUser(@RequestBody User user) {
        String data = "新增成功，接收到用户：" + user.getName() + "，年龄：" + user.getAge();
        return Result.success(data);
    }

    @PutMapping("/{id}")
    public Result<String> updateUser(@PathVariable Long id, @RequestBody User user) {
        String data = "更新成功，用户ID：" + id + "，更新后名称：" + user.getName() + "，年龄：" + user.getAge();
        return Result.success(data);
    }

    @DeleteMapping("/{id}")
    public Result<String> deleteUser(@PathVariable Long id) {
        String data = "删除成功，已删除ID为" + id + "的用户";
        return Result.success(data);
    }
}