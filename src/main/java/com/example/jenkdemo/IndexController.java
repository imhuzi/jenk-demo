package com.example.jenkdemo;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2022/8/3
 */
@RestController
public class IndexController {

  @Resource
  BuildProperties buildProperties;

  @RequestMapping("/")
  public BuildProperties index() {
    return buildProperties;
  }
}
