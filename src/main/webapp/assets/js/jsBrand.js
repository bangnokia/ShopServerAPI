var urlForm;
var id_temp = '';
function brand() {
    $('#jqxTreeCategory').on('itemClick', function (event)
    {
        var args = event.args;
        var item = $('#jqxTreeCategory').jqxTree('getItem', args.element);
        var label = item.label;
        var id = item.id;
        var parentid = item.parentId;

        bindingItem(id)
    });

    $('#saveForm').bind('click', function () {
        do_save_form(urlForm + '/admin/brand/save', 'form_brand', 'getlistbrand();$("#clearForm").click();');
    });

    $('#clearForm').bind('click', function () {
        clear_form('form_brand');
    });

    $('#deleteFORM').bind('click', function () {
        if ($('#form_brand_idCat').val() == '') {
            alert('select brand to delete');
            return;
        }

        $.ajax({
            url: urlForm + '/admin/brand/delete?id=' + $('#form_brand_id').val(), // Your Servlet mapping or JSP(not suggested)
            //   data: {idCat: },
            type: 'POST',
            //dataType: 'html', // Returns HTML as plain text; included script tags are evaluated when inserted in the DOM.
            success: function (response) {
                alert('OK');
                getlistCat();
                // create an empty div in your page with some id
            },
            error: function (request, textStatus, errorThrown) {
                alert('faile');
                getlistCat();
                alert(errorThrown);
            }
        });
    });

    getlistbrand();
}

function bindingItem(id) {
    id_temp = id;
    var url = urlForm + '/admin/brand/getitemdetail?id=' + id;

    var datajson = getDataJson(url);

    if (datajson == null)
        return;
    else {
        bindItemDetail(datajson, 'form_brand');
    }
}

function getlistbrand() {
    var url = urlForm + '/admin/brand/getlist?1=1';

    var datajson = getDataJson(url);

    if (datajson == null)
        return;

    var source =
            {
                localdata: datajson,
                datatype: "json",
                datafields: [
                    {name: 'id', type: 'string'},
                    {name: 'name', type: 'string'},
                    {name: 'status', type: 'string'}
                ],
                id: 'id'
            };
    var dataAdapter = new $.jqx.dataAdapter(source);
    $("#gridBrand").jqxGrid({
        width: 400,
        source: dataAdapter,
        pageable: true,
        autoheight: true,
        sortable: true,
        altrows: true,
        enabletooltips: true,
        // editable: true,
        selectionmode: 'singlerow',
        columns: [
            {text: 'id brand', datafield: 'id', width: 100},
            {text: 'name', datafield: 'name', width: 200},
            {text: 'status', datafield: 'status', width: 100}
        ]
    });

    $('#gridBrand').unbind('rowselect');
    $('#gridBrand').on('rowselect', function (event)
    {
        var args = event.args;
        var rowBoundIndex = args.rowindex;
        var rowData = args.row;
        
        console.log(rowData);
        
        bindItemDetailGrid(rowData, 'form_brand');
    });
}