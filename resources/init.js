var source = '';
var options = '';
var output = '';
var output_formatted = '';
var output_map = '';
var output_text = '';
var output_column = '';
var output_line = '';
var output_status = '';
var output_file = '';
var input_relative_path = '';
function setSourceAndOptions(input, input_path, output_name) {
    source = input;
    input_relative_path = input_path;
    options = {inputPath: input_path, outputPath: output_name};
}
function setOutput(result) {
    output = result;
    output_formatted = result.formatted;
    output_map = result.map;
    if (output_map != undefined) {
        if ('sourcesContent' in output_map) {
            delete output_map.sourcesContent;
        }
        if ('sourceRoot' in output_map) {
            delete output_map.sourceRoot;
        }
        output_map.sources = [input_relative_path];
    }
    output_text = result.text;
    output_column = result.column;
    output_line = result.line;
    output_status = result.status;
    output_file = result.file;
}
function simpleIncludes(arr, value) {
    output = false;
    arr.forEach(function(a, b, c) {
        if (a === value) {
            output = true;
        }
    });
    return output;
}
