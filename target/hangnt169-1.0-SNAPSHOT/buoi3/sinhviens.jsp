<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <form action="">
        Tên: <input name="ten"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="/sinh-vien/view-add">Add Student</a></button>
    <tr>
        <th>STT</th>
        <th>MSSV</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSinhVien}" var="sinhVien" varStatus="index">
        <tr>
            <td>${index.index}</td>
            <td>${sinhVien.mssv}</td>
            <td>${sinhVien.ten}</td>
            <td>${sinhVien.tuoi}</td>
            <td>${sinhVien.diaChi}</td>
            <td>${sinhVien.gioiTinh}</td>
            <td>
                <a href="/sinh-vien/detail?ma=${sinhVien.mssv}">Detail</a>
                <a href="/sinh-vien/view-update?mssv=${sinhVien.mssv}">Update</a>
                <a href="/sinh-vien/remove?ma=${sinhVien.mssv}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
