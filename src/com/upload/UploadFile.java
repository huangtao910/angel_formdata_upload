package com.upload;

/**
 * 文件上传demo
 * <p/>
 * 文件上传
 *
 * @param request
 * @param response
 * @return 得到图片保存目录的真实路径根据真实路径创建目录页面控件的文件流获取文件的后缀拼成完整的文件保存路径加文件 以下是前端代码  复制即可使用
 */
/*@Controller
@RequestMapping("/demo")
public class DemoController {
    */
/**
 * 文件上传
 * @param request
 * @param response
 * @return
 */
/*
    @ResponseBody
    @RequestMapping("/uploads")
    public String upload(HttpServletRequest request,HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        */
/**得到图片保存目录的真实路径**/
/*
        String logoRealPathDir = "d:/demo";
        */
/**根据真实路径创建目录**/
/*
        File logoSaveFile = new File(logoRealPathDir);
        if (!logoSaveFile.exists())
            logoSaveFile.mkdirs();
        */
/**页面控件的文件流**/
/*
        MultipartFile multipartFile = multipartRequest.getFile("file");
        */
/**获取文件的后缀**/
/*
        System.out.println(multipartFile.getOriginalFilename());
        String suffix = multipartFile.getOriginalFilename().substring
                (multipartFile.getOriginalFilename().lastIndexOf("."));

        */
/**拼成完整的文件保存路径加文件**/
/*
        String name = +System.currentTimeMillis() + suffix;
        String fileName = logoRealPathDir + File.separator + name;
        File file = new File(fileName);

        String data = file.getPath();
        try {
            multipartFile.transferTo(file);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println( "上传成功：" + name);
        return "上传成功";
    }*/
/** 以下是前端代码  复制即可使用 */
/* <!DOCTYPE html>
    <!-- status ok -->
    <html lang="en">
    <head>
    <!-- common header -->
    <link rel="import" href="../../static/common/view/main.tpl?__inline">

    <link rel="stylesheet" href="../../static/address/address.less">

    <!--
    @require ../../static/common/lib/jquery/jquery.js
    @require ../../static/common/lib/template/template.js
    @require ../../static/common/lib/storage.js
    @require ../../static/common/base/base.js
    @require ../../static/common/lib/city.js
    -->
    </head>
    <body>
    <form id= "uploadForm">
    <p >上传文件： <input type="file" name="file"/></ p>
    <input type="button" value="上传" onclick="doUpload()" />
    </form>
    <script type="text/javascript">
    function doUpload() {
        var formData = new FormData($( "#uploadForm" )[0]);
        $.ajax({
                url: host + 'demo/uploads.htm',
                type: 'POST',
                data: formData,
                async: false,
                cache: false,
                contentType: false,
                processData: false,
                success: function (returndata) {
            alert(returndata);
        },
        error: function (returndata) {
            alert(returndata);
        }
        });
    }
    </script>
    </body>
    </html>
}*/
