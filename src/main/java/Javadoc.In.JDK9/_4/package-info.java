/**
 * <h2>追加されたコマンドラインオプション(2)</h2>
 * <table class="small">
 *   <caption>出力スコープ関係</caption>
 *   <tr><td>--show-members
 *       <td>どのメンバー(フィールドやメソッドなど)をドキュメント化するかを指定する。
 *   <tr><td>--show-types
 *       <td>どの型(クラスやインタフェースなど)をドキュメント化するかを指定する。
 *   <tr><td>--show-packages
 *       <td>どのモジュールのパッケージをドキュメント化するかを指定する。
 *   <tr><td>--show-module-contents
 *       <td>モジュール宣言のドキュメント化の粒度を指定する。
 * </table>
 * <table class="small" style="font-family: monospace" border=1>
 *   <caption>Short form options mapping</caption>
 *   <tr><th>Older option<th colspan="5">Equivalent to these values with the new option
 *   <tr><th><th><code>--show-members</code><th><code>--show-types</code><th><code>--show-packages</code><th><code>--show-module-contents</code>
 *   <tr><td><code>-public</code><td>public<td>public<td>exported<td>api
 *   <tr><td><code>-protected</code><td>protected<td>protected<td>exported<td>api
 *   <tr><td><code>-package</code><td>package<td>package<td>all<td>all
 *   <tr><td><code>-private</code><td>private<td>private<td>all<td>all
 * </table>
 * <small>※詳細は<a href="https://docs.oracle.com/javase/9/docs/api/jdk/javadoc/doclet/package-summary.html">jdk.javadoc/doclet</a>で</small>
 */
package _4;
